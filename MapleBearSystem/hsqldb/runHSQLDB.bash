
DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" >/dev/null && pwd )"
echo $DIR
cd "$DIR"
java -cp hsqldb.jar org.hsqldb.server.Server --database.0 file:dworhypersqldb --dbname.0 dwordb