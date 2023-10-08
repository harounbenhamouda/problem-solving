package algo;

public class Hashtable {
private HashNode[] buckets;
private int numBuckets;
private int size ;
   public Hashtable() {
    this(10); // default capacity
 }

 public Hashtable(int capacity) {
    this.numBuckets = capacity;
    this.buckets = new HashNode[numBuckets];
    this.size = 0;
 }

public static  class HashNode{
	private Integer key;
	private String value;
	private HashNode next;
	   
	
	 public HashNode(Integer key, String value) {
         this.key = key;
         this.value = value;
      }
	 }
}
