package linkedList;

public class TestLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MySingleLinkedList<String> list = new MySingleLinkedList<>();
		list.addFirst("Monday");
		list.addFirst("Sunday");
		Node<String> before = list.head;
		list.addAfter(before, "BEFORE_DAY");
		//list.removeFirst();
		Node<String> result = list.getNode(1);
		System.out.println(result.data);
		String data =  list.get(0);
		System.out.println(data);
		String remove = list.remove("BEFORE_DAY");
		System.out.println(remove);
	}

}
