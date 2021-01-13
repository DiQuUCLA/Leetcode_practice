import java.util.*;

class ZigZag_Conversion {
	public static String convert(String s, int numRows){
		if(numRows == 1)
        {
            return s;
        }
	
	ArrayList<char[]> zigzag = new ArrayList<char[]>();	
	int row = 0, col = 0, s_size = s.length();
		boolean full_row = true;

		char[] r = new char[numRows];
		for(int i = 0; i < s_size; i++) {
			r[col] = s.charAt(i);
			if(full_row) {
				if(col == numRows-1) {
					col--;
					row++;
					zigzag.add(r);
					r = new char[numRows];
                    if(col != 0)
                    {
					    full_row = false;
                    }
				}else{
					col++;
				}
			}else
			{
				col--;
				row++;
			        zigzag.add(r);
				r = new char[numRows];
				if(col == 0)
				{
					full_row = true;
				}
			}
		}

		zigzag.add(r);
		StringBuilder str = new StringBuilder();
		for(int i = 0; i < numRows; i++)
		{
			for(int j = 0; j <=row; j++)
			{
				if(zigzag.get(j)[i] != 0)
				{
					str.append(zigzag.get(j)[i]);
				}
			}	
		}

		String result = str.toString();
		return result;
	}

	public static void main(String[] args)
	{
		String result = convert("PAYPALISHIRING", 4);
	}
}
