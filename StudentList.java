class StudentList{
	private Node first;

	public boolean add(Student student){ //Insertion order
		return addLast(student); //add(size(),data)
	}
	public boolean add(int index, Student student){
		if(index>=0 && index<=size()){
			Node n1=new Node(student);
			if(index==0){
				n1.next=first;
				first=n1;
			}else{
				int count=0;
				Node temp=first;
				while(count<index-1){
					count++;
					temp=temp.next;
				}
				n1.next=temp.next;
				temp.next=n1;
			}
			return true;
		}
		return false;
	}
	public boolean addLast(Student student){
		return add(size(),student);
	}
	public boolean addFirst(Student student){
		return add(0,student);		
	}
	public void removeLast(){
		remove(size()-1);
	}
	public void removeFirst(){
		remove(0);
	}
	public void remove(int index){
		if(!isEmpty() && index>=0 && index<size()){
			if(index==0){
				first=first.next;
			}else{
				int count=0;
				Node temp=first;
				while(count<index-1){
					count++;
					temp=temp.next;
				}
				temp.next=temp.next.next;
			}
		}
	}
	public Student get(int index){
		if(index>=0 && index<size()){
			int count=0;
			Node temp=first;
			while(count<index-1){
				count++;
				temp=temp.next;
			}
			return temp.student;
		}
		return null;
	}
	public void printList(){
		System.out.print("{");
		Node temp=first;
		while(temp!=null){
			System.out.print(temp.student+", ");
			temp=temp.next;
		}
		System.out.println(isEmpty() ?"empty]":"\b\b]");
	}
}
