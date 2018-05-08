import com.sun.org.apache.xpath.internal.SourceTree;

public class NoobChain {
    public static void main(String[] args) {
        Block genesisBlock = new Block("Genesis block", "0");
        System.out.println("Hash for genesis block: " + genesisBlock.hash);

        Block secondBlock = new Block("2nd block", genesisBlock.hash);
        System.out.println("Hash for second block: " + secondBlock.hash);

        Block thirdBlock = new Block("3rd block", secondBlock.hash);
        System.out.println("Hash for third block: " + thirdBlock.hash);
    }
}
