import org.junit.jupiter.params.shadow.com.univocity.parsers.common.input.AbstractCharInputReader;

class GoldenApples {
    public static void main(String[] args) {
        int hashCtx = 0;
        int serverRandom = 1;
        int signedParams = 2;
        int hashOut = -1;
        fail:
        {

            if ((SSLHashSHA1.update(hashCtx, serverRandom)) != 0)
                break fail;
            if ((SSLHashSHA1.update(hashCtx, signedParams)) != 0)
                break fail;
                //break fail;
            if ((SSLHashSHA1.update(hashCtx, hashOut)) != 0)
                break fail;
            Object err = sslRawVerify(hashOut);

            System.out.println(err);
        }
    }

    private static Object sslRawVerify(Object hashOut) {
        return null;
    }

    private static class SSLHashSHA1 {

        public static int update(Object hashCtx, Object serverRandom) {
            return 0;
        }
    }
}