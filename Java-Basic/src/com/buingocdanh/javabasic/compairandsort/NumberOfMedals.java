package com.buingocdanh.javabasic.compairandsort;

/** so luong huy chuong
 * */
public class NumberOfMedals {
    // Số huy chuong vang
    private int goldCount;
 
    // So huy chuong bac.
    private int silverCount;
 
    // So huy chuong dong
    private int bronzeCount;
 
    public NumberOfMedals(int goldCount, int silverCount, int bronzeCount) {
        this.goldCount = goldCount;
        this.silverCount = silverCount;
        this.bronzeCount = bronzeCount;
    }
 
    public int getGoldCount() {
        return goldCount;
    }
 
    public int getSilverCount() {
        return silverCount;
    }
 
    public int getBronzeCount() {
        return bronzeCount;
    }
 
    // Ghi de phương thuc equals(Object) của lop Object.
    @Override
    public boolean equals(Object other) {
        // Neu other = null thi tra ve false.
        if(other==null) {
        	return false;
        }
        // Nếu 'other' không phải là kiểu NumberOfMedals
        // thì trả về false.
       if(!(other instanceof NumberOfMedals))
       {
    	   return false;
       }
 
        NumberOfMedals otherNoM = (NumberOfMedals) other;
 
        if (this.goldCount == otherNoM.goldCount && this.silverCount == otherNoM.silverCount
                && this.bronzeCount == otherNoM.bronzeCount) {
            return true;
        }
        return false;
    }
 
}
