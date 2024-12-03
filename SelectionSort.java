package lab04;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int size = 6;
int[] data = new int[size];
System.out.println(&quot;Enter 6 numbers:\n&quot;);
for(int i=0; i&lt;data.length; i++) {
data[i] = input.nextInt();
}
SelectionSortingAlgorithm sort = new SelectionSortingAlgorithm(data);
System.out.println(&quot;Before Selection Sorting&quot;);
sort.printArray();
sort.selectionSort();
System.out.println(&quot;\n After Selection Sorting&quot;);
sort.printArray();
}
}
package lab04;
public class SelectionSortingAlgorithm {
int[] data;
public SelectionSortingAlgorithm(int[] data) {

this.data = data;

}
public void selectionSort() {
int temp = 0;
int minindex = 0;
for(int j=0; j&lt;data.length-1; j++) {
minindex = j;
for(int i=j+1; i&lt;data.length; i++) {
if(data[i]&lt;data[minindex]) {
minindex =i;
}
}
temp = data[minindex];
data[minindex]=data[j];
data[j]=temp;

}
}
public void printArray() {

for(int i=0; i&lt;data.length; i++) {
System.out.print(data[i]+&quot; &quot;);
}
}

}