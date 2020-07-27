package linkedList;

public class MySingleLinkedList<T> {
	public Node<T> head;
	public int size;

	public MySingleLinkedList() {
		head = null;
		size = 0;
	}

	public void addFirst(T item) {
		Node<T> temp = new Node<T>(item);
		temp.next = head;
		head = temp;
		size++;
	}

	public void addAfter(Node<T> before, T item) {
		Node<T> temp = new Node<T>(item);
		temp.next = before.next;
		before.next = temp;
		size++;
	}

	public T removeFirst() {
		if (head == null) {
			return null;
		} else {
			Node<T> temp = head;
			head = head.next;
			size--;
			return temp.data;
		}
	}

	public T removeAfter(Node<T> before) {
		if (before.next == null) {
			return null;
		} else {
			Node<T> temp = before.next;
			before.next = before.next.next; // temp.next;
			size--;
			return temp.data;
		}
	}

	public int indexOf(T item) {
		Node<T> p = head;
		int index = 0;
		while (p != null) {
			if (p.data.equals(item)) {
				return index;
			}
			p = p.next;
			index++;
		}
		return -1;
	}

	public Node<T> getNode(int index) {
		Node<T> p = head;
		int i = 0;
		if (index < 0 || index >= size) {
			return null;
		} else {
			while (i < size) {
				if (i == index) {
					return p;
				} else {
					p = p.next;
				}
				i++;
			}
			return p;
		}
	}

	public T get(int index) {
		if (index < 0 || index >= size)
			return null;
		
		Node<T> p = head;
		for (int i = 0; i < index; i++)
			p = p.next;
		return p.data;
	}
	
	public void add(int index,T item) {
		if(index < 0 || index >= size) {
			return;
		}
		if (index == 0) {
			addFirst(item);
		} else  {
			Node<T> node = getNode(index-1);
			addAfter(node, item);
		}
	}
	
	public T remove(int index) {
		if (index < 0 || index >= size) {
			return null;
		}
		
		if (index == 0 ) 
			return remove(index);
		Node<T> prev = getNode(index-1);
		return removeAfter(prev);
	}
	
	public T remove(T item) {
		int index = indexOf(item);
		return remove(index);
	}
}
