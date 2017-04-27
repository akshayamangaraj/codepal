///**
// *
// */
//
///**
// * @author sparid2
// *
// */
//public class RearrangeElements {
//    ����
//    private void leftShift(int[] array, int low, int high)
//    ����{
//    ��������int lastElement = array[high];
//    ���������
//    ��������for (int i = high; i > low; i--)
//    ��������{
//    ������������array[i] = array[i-1];
//    ��������}
//    ���������
//    ��������array[low] = lastElement;
//    ����}
//
//    private boolean notAtRightPosition(int[] array, int index)
//    ����{
//    ��������// even indices should have positive elements in them
//    ��������if ((index % 2) == 0)
//    ��������{
//    ������������if ((array[index]) < 0) // if negative element
//    ������������{
//    ����������������return true;
//    ������������}
//    ������������else
//    ������������{
//    ����������������return false;
//    ������������}
//    ��������}
//    ��������else // odd indices should have negative elements in them
//    ��������{
//    ������������if ((array[index]) < 0)
//    ������������{
//    ����������������return false;
//    ������������}
//    ������������else
//    ������������{
//    ����������������return true;
//    ������������}
//    �
//    ��������}
//    ����}
//    private int getNextOpposite(int[] array, int index)
//    ����{
//    ��������for (int i = index+1; i < array.length; i++)
//    ��������{
//    ������������if ((array[i]*array[index]) < 0)
//    ������������{
//    ����������������return i;
//    ������������}
//    ��������}
//    ��������
//    ��������return -1;
//    ����}
//
//    public void reArrangePositivesNegatives(int[] array)
//    ����{
//    ��������for (int i = 0; i < array.length; i++)
//    ��������{
//    ������������if (notAtRightPosition(array, i))
//    ������������{
//    ����������������int nextOppositeIndex = getNextOpposite(array, i);
//    ����������������if (nextOppositeIndex != -1)
//    ����������������{
//    ��������������������leftShift(array, i, nextOppositeIndex);
//    ����������������}
//    ����������������else // no more opposite signed elements
//    ����������������{
//    ��������������������break;
//    ����������������}
//    ������������}
//    ��������}
//    ����}
//
//    public static void main(String[] args)
//    ����{
//    ��������RearrangeElements solution = new RearrangeElements();
//    ���������
//    ��������int[] testArray = {-1,3,2,4,5,-6,7,-9};
//    ���������
//    ��������solution.reArrangePositivesNegatives(testArray);
//    ���������
//    ��������for(int i = 0;� i < testArray.length; i++)
//    ��������{
//    ������������System.out.println(testArray[i]);
//    ��������}
//    ����}
//    }��������