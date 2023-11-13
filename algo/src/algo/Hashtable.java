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
public void put(Integer key,String value) {
	HashNode[] hashmap= new HashNode[10];
	HashNode head=hashmap[key%10];

		while(head!=null) {
			if(head.key.equals(key)) {
			head.value=value;
			return;
		}
		head=head.next;
		}
		head=hashmap[key%10];
		 HashNode node = new HashNode(key, value);
		 node.next=head;
		 hashmap[key%10] = node;

		 size++;
	
}
public String get(Integer key) {
    if (key == null) {
       throw new IllegalArgumentException("Key is null !!!");
    }
    int bucketIndex = key%10;
    HashNode head = buckets[bucketIndex];
    while (head != null) {
       if (head.key.equals(key)) {
          return head.value;
       }
       head = head.next;
    }

    return null;
 }
public String remove(Integer key) {
    if (key == null) {
       throw new IllegalArgumentException("Key is null !!!");
    }

    int bucketIndex = key%10;
    HashNode head = buckets[bucketIndex]; 
    HashNode previous = null;

    while (head != null) {
       if (head.key.equals(key)) {
          break;
       }
       previous = head;
       head = head.next;
    }
    if (head == null) {
       return null;
    }
    size--;
    if (previous != null) {
       previous.next = head.next;
    } else {
       buckets[bucketIndex] = head.next;
    }

    return head.value;
 }
    public static void main(String[] args) {
        Hashtable table = new Hashtable(10);
        table.put(105, "Tom");
        table.put(21, "Harry");
        table.put(31, "Dinesh");
   
    
}
}
