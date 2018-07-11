import java.io.RandomAccessFile;

class DiskInitializer
{
    public static void main(String[] args) throws Exception
    {
    	RandomAccessFile file = new RandomAccessFile("disk.txt","rw"); 
/*
 	Java.io.RandomAccessFile class file behaves like a large array of bytes stored in the file system. Which allows to read and write byte arrays from file

*/
    	StringBuilder sb = new StringBuilder();

    	for( int i=0 ; i<1048020+20971520 ; i++ )
	sb.append((char)0);

    	file.write(sb.toString().getBytes());
    	file.close();
    }
}
