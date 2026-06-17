class Block {

    int blockNumber;
    String data;
    String previousHash;
    String currentHash;
    Block next;

    Block(
            int blockNumber,
            String data,
            String previousHash,
            String currentHash
    ) {
        this.blockNumber = blockNumber;
        this.data = data;
        this.previousHash = previousHash;
        this.currentHash = currentHash;
    }

    void displayBlock() {

        System.out.println("Block Number: " + blockNumber);
        System.out.println("Data: " + data);
        System.out.println("Previous Hash: " + previousHash);
        System.out.println("Current Hash: " + currentHash);
        System.out.println("---------------------------");
    }
}

public class BlockchainLinkedChain {

    public static void main(String[] args) {

        Block block1 = new Block(
                1,
                "Nidhish paid Rahul Rs. 500",
                "0",
                "HASH-A1"
        );

        Block block2 = new Block(
                2,
                "Rahul paid Priya Rs. 200",
                block1.currentHash,
                "HASH-B2"
        );

        Block block3 = new Block(
                3,
                "Priya paid Aman Rs. 100",
                block2.currentHash,
                "HASH-C3"
        );

        // Connect blocks
        block1.next = block2;
        block2.next = block3;

        Block currentBlock = block1;

        while (currentBlock != null) {

            currentBlock.displayBlock();

            currentBlock = currentBlock.next;
        }
    }
}