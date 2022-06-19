class HydraOfLerna {

public static void main(String[] args) {
FileInputStream stream = null;
try {
for(String name: args) {
stream = new FileInputStream(name);
}
} finally {
if (stream != null) {
stream.close();
}
}

}
