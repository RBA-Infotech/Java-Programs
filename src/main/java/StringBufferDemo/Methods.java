package StringBufferDemo;

public class Methods {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("Java");
		sb.
		//constructors and  methods in string buffer
		
		StringBuffer(): Creates an empty StringBuffer with an initial capacity of 16.
		StringBuffer(String str): Creates a StringBuffer with the specified string.
		StringBuffer(int capacity): Creates an empty StringBuffer with the specified capacity.
		
		append(String str): Appends the specified string to the current StringBuffer
		insert(int offset, String str): Inserts the specified string at the given position
		replace(int start, int end, String str): Replaces the characters in the specified range with the given string.
		delete(int start, int end): Removes characters from the specified range.
		charAt(): 
		compareTo():
		equals(): 
		isEmpty():
		subString(): 
		setCharAt(int index, char ch): Sets the character at the specified index to the given character.
		reverse(): Reverses the characters in the StringBuffer.
		capacity(): Returns the current capacity of the StringBuffer
		length(): Returns the length (number of characters) of the StringBuffer
		setLength(int newLength): Sets the length of the StringBuffer. If the new length is shorter, the content is truncated.
		toString(): Converts the StringBuffer to a String
		indexOf(String str): Returns the index of the first occurrence of the specified string
		indexOf(String str, int fromIndex): Returns the index of the specified string starting from the given index.
		lastIndexOf(String str): Returns the index of the last occurrence of the specified string.
		lastIndexOf(String str, int fromIndex): Searches backwards for the string from the given index.
		
		
	
	}

}
