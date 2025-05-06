package Pertemuan6;

public class StrukturList {
	private Node HEAD;
	public StrukturList () {
		this.HEAD = null;
	}
	public boolean isEmpty () {
		return HEAD == null;
	}
	public void addTail (int data) 
	{
		Node posNode=null, curNode=null;
		
		Node newNode = new Node (data);
		if (isEmpty()) 
		{
			HEAD = newNode;
		}
		else 
		{
			curNode = HEAD;
			while (curNode != null) 
			{
				posNode = curNode;
				curNode = curNode.getNext();
			}
			posNode.setNext(newNode);
		}
			
	}
	
	public void addHead(int data) {
		Node newNode = new Node (data);
		if (isEmpty()) {
			HEAD = newNode;
		}
		else {
			newNode.setNext(HEAD);
			HEAD = newNode;
		}
		
	}
	
	public void addMid(int data, int position) {
        Node newNode = new Node(data);
        if (HEAD== null) {
            HEAD = newNode;
            return;
        }
        
        else {
        Node curNode = HEAD;
        if (position == 1) {  
            newNode.setNext(curNode);
            HEAD = newNode;
            return;
        }
        
        else {
        Node posNode = null;
        int i = 1;

        while (curNode != null && i < position) {
            posNode = curNode;
            curNode = curNode.getNext();
            i++;
        }

        posNode.setNext(newNode);
        newNode.setNext(curNode); 
    }
        }
	}
	public void displayElement() {
		Node curNode = HEAD;
		while (curNode != null) {
			System.out.print(curNode.getData()+ " ");
			curNode = curNode.getNext();		}
	}

	
	public void removeHead() {
		if(isEmpty()) {
			System.out.println("List Kosong");
		}
		else {
			Node temp = HEAD;
			HEAD = HEAD.getNext();
			dispose(temp);
		}
	}
	
	private void dispose(Node temp) {
		temp.setNext(null);
		temp = (null);
		
	}
	
	
	public void removeTail() {
	    if (HEAD != null) {
	        if (HEAD.getNext() == null) { // Jika hanya ada satu elemen
	            HEAD = null;
	        } else {
	            Node lastNode = HEAD;
	            Node preNode = null;

	            while (lastNode.getNext() != null) {
	                preNode = lastNode;
	                lastNode = lastNode.getNext();
	            }

	            preNode.setNext(null); 
	            dispose(lastNode);    
	        }
	    }
	}
	
	public void removeMid(int e)
	{
	    Node preNode = new Node(0);
	    Node tempNode;
	    int i;
	    boolean ketemu;

	    if (isEmpty())
	    {
	        System.out.println("Elemen list kosong");
	    }
	    else
	    {
	        ketemu = false;
	        i = 1;
	        tempNode = HEAD;
	        while (tempNode.getNext() != null && !ketemu)
	        {
	            if (tempNode.getData() == e)
	            {
	                ketemu = true;
	            }
	            else
	            {
	                preNode = tempNode;
	                tempNode = tempNode.getNext();
	                i++;
	            }
	        }

	        if (ketemu == true)
	        {
	            if (i == 1)
	                HEAD = null;
	            else
	            {
	                preNode.setNext(tempNode.getNext());
	                dispose(tempNode);
	            }
	        }
	    }
	}
	
	public boolean find(int x) {
		Node curNode = HEAD;
		boolean ketemu = false;
		while (curNode != null &&!ketemu)
		{
			if (curNode != null && !ketemu)
				ketemu = true;
			else
				curNode = curNode.getNext();
		}
		return ketemu;
		
	}
	public int size() {
	    Node curNode = HEAD;
	    int jumlah = 0;
	    while (curNode != null) {
	        jumlah = jumlah + 1;
	        curNode = curNode.getNext();
	    }
	    return jumlah;
	}
	
	public void clear ( ) {
		HEAD = null;
	}

}
	

