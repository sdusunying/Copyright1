package InterTest;

public class Line                        	//ֱ���࣬�ⲿ��
{
    protected Point p1,p2;             //ֱ�ߵ������յ�
    protected class Point                //���࣬�ڲ���
    {
        protected int x,y;                	//�ڲ���ĳ�Ա����
        protected Point(int x,int y)  //�ڲ���Ĺ��췽��
        {
            this.x = x;
            this.y = y;
        }
    }
}

