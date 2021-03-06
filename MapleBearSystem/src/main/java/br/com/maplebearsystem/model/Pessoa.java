package br.com.maplebearsystem.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Pessoa
 *
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Pessoa implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private boolean enabled;
	private String email;

	@OneToMany(mappedBy = "pessoa", targetEntity = Address.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
	private List<Address> addresses;

	@OneToMany(mappedBy = "pessoa", targetEntity = Phone.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
	private List<Phone> phones;

	public Pessoa() {
		addresses = new ArrayList<Address>();
		phones = new ArrayList<Phone>();
	}

	/**
	 * @param id
	 * @param name
	 * @param enabled
	 * @param email
	 * @param address - Address entity class that will be inseted as the first
	 *                Address in Address list.
	 * @param phone   - Phone entity class that will be inseted as the first phone
	 *                in phones list.
	 */
	public Pessoa(Long id, String name, boolean enabled, String email, Address address, Phone phone) {
		this.id = id;
		this.name = name;
		this.enabled = enabled;
		this.email = email;

		this.addresses = new ArrayList<Address>();
		this.addresses.add(address);

		this.phones = new ArrayList<Phone>();
		this.phones.add(phone);
	}

	/**
	 * @param id
	 * @param name
	 * @param enabled
	 * @param email
	 * @param adresses
	 * @param phones
	 */
	public Pessoa(Long id, String name, boolean enabled, String email, List<Address> adresses, List<Phone> phones) {
		this.id = id;
		this.name = name;
		this.enabled = enabled;
		this.email = email;
		this.addresses = adresses;
		this.phones = phones;
	}

	@Deprecated
	public void addPhone(String phone) throws NumberFormatException {
		Phone newphone = new Phone();
		Integer.parseInt(phone);
		newphone.setNumber(Integer.parseInt(phone));
		newphone.setPessoa(this);
		phones.add(newphone);
	}

	public void addPhone(Phone phone) {
		if (phones.contains(phone))
			return;

		phones.add(phone);
		phone.setPessoa(this);
	}

	public void addAddress(Address address) {
		if (addresses.contains(address))
			return;

		addresses.add(address);
		address.setPessoa(this);
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public String getEmail() {
		return email;
	}

	public Long getId() {
		return this.id;
	}

	public String getName() {
		return name;
	}

	public abstract String getPessoaCNumber();

	public List<Phone> getPhones() {
		return phones;
	}

	public String getPhoneListBriefString() {
		try {
			String briefString = "";

			Iterator<Phone> iterator = phones.iterator();

			briefString = briefString + ((Phone) iterator.next()).getPhoneString();

			while (iterator.hasNext()) {
				Phone phone = (Phone) iterator.next();
				briefString = briefString + ", " + phone.getPhoneString();
			}

			return briefString;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(
					"Info: failed to build PhoneListBriefString, the entity " + this.getClass().getName() + "\n"
							+ "may have no phones. Falling back to empty String.");

			return "";
		}
	}

	public String getAddressListBriefString() {
		try {
			String briefString = "";

			Iterator<Address> iterator = addresses.iterator();

			briefString = briefString + ((Address) iterator.next()).getAddress();

			while (iterator.hasNext()) {
				Address address = (Address) iterator.next();
				briefString = briefString + ", " + address.getAddress();
			}

			return briefString;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(
					"Info: failed to build AddressListBriefString, the entity " + this.getClass().getName() + "\n"
							+ "may have no Addresses. Falling back to empty String.");

			return "";
		}

	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setAddresses(List<Address> adresses) {
		this.addresses = adresses;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPhones(List<Phone> phones) {
		this.phones = phones;
	}

	public Address getPrimaryAddress() {
		return addresses.get(0);
	}

	public Phone getPrimaryPhone() {
		return phones.get(0);
	}

	public void removePhone(Phone phone) {
		if (!phones.contains(phone))
			return;

		phones.remove(phone);
		phone.setPessoa(null);
	}

	public void removeAddress(Address address) {
		if (!addresses.contains(address))
			return;

		addresses.remove(address);
		address.setPessoa(null);
	}

}
