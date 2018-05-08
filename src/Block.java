import java.util.Date;

public class Block {
    public String data;
    public long timeStamp;
    public String hash;
    public String previousHash;

    public Block(String data, String previousHash) {
        this.data = data;
        this.previousHash = previousHash;
        this.timeStamp = new Date().getTime();
        this.hash = calculateHash();
    }

    public String calculateHash() {
        return StringUtil.applySha256(
                previousHash +
                Long.toString(timeStamp) +
                data
        );
    }
}
