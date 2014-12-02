/**
 * 
 */
package sarow.lab.java.io;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author wenpingliu
 * Date Mar 13, 2014
 */
public class NioServer {
	public static void main(String[] args) throws Exception {
		RandomAccessFile aFile = new RandomAccessFile("example", "rw");
		//新建一个channel
		FileChannel inChannel = aFile.getChannel();
		
		ByteBuffer buffer = ByteBuffer.allocate(48);
		int bytesRead = inChannel.read(buffer);
		//读取指定大小
		while (bytesRead != -1) {
			
			buffer.flip();
			while (buffer.hasRemaining()) {
				System.out.println();
			}
			buffer.clear();
			bytesRead = inChannel.read(buffer);
			
		}
		//读完了
		aFile.close();
		
	}
}
