
public class Array {

    private int[] items;
    private int count = 0;

    public Array(int length){
        items = new int[length];
    }

    public int indexOf(int item)
    {
        for(int i = 0; i < count; i++){
            if(items[i] == item) return i;
        }
        return -1;
    }

    public void removeAt(int idx)
    {
        if(idx < 0 || idx >= count){
            throw new IllegalArgumentException("Index out of bounds");
        }

        for(int i = idx; i < count; i++){
            items[i] = items[i+1];
        }
        count--;

    }

    public void insert(int item)
    {
        if (count == items.length) {
            int[] newItems = new int[count * 2];

            for (int i=0; i<count; i++) {
                newItems[i] = items[i];
            }

            items = newItems;
        }

        items[count++] = item;
    }

    public void print()
    {
        for (int i=0; i<count; i++) {
            System.out.println(items[i]);
        }
    }

}
