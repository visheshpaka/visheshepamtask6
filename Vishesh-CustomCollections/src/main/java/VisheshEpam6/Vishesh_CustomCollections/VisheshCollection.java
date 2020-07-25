package VisheshEpam6.Vishesh_CustomCollections;

public class VisheshCollection
{
	 private Object[] LArray=new Object[10];
	    private int elementcount=0;
	    public void add(Object obj){
	        if(elementcount==LArray.length){
	            increaseCapacity(); 
	        }
	        LArray[elementcount]=obj;
	        elementcount++;
	    }
	    public void increaseCapacity(){
	        int newCapacity= LArray.length*2;
	        Object[] nextArray=new Object[newCapacity];
	        //copying old list to new list
	        for(int i=0;i<LArray.length;i++){
	            nextArray[i]=LArray[i];
	        }
	        LArray=nextArray;
	    }
	    
	    public void fetch(int i)
	    {
	    	System.out.println("Element is:"+LArray[i]);
	    }
	    public void remove(int i)
	    {
	        if(elementcount==0)
	        {
	            System.out.println("List is empty,Cannot delete the elements...");
	        }
	        else {
	            Object r=LArray[i];
	            System.out.println("\nRemoved element is "+ r);
	            System.arraycopy(LArray, i+1,LArray,i,LArray.length-i-1);
	            elementcount--;
	        }
	    }
	    public void printList() {
	            for(Object obj1:LArray)
	                if(obj1==null)
	                    break;
	                else
	                    System.out.print(obj1+" ");
	            System.out.println();
	    }
	    public String toString() {
	        if (elementcount == 0)
	            return "[ ]";
	        else {
	            String res = "[ ";
	            for (Object obj1 : LArray)
	                if (obj1 == null)
	                    break;
	                else
	                    res += obj1 + " , ";

	            res = res.substring(0, res.length() - 2);

	            res += "]\n";
	            return res;
	        }
	    }
	    public Object get(int index){
	        if(index<0||index>=elementcount){
	            throw new IndexOutOfBoundsException(""+index);
	        }
	        return  LArray;
	    }
	    
	   

}
