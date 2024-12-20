import java.awt.*;
import javax.swing.*;

//勉強量

public class niconico{
   public static void main(string[] args){
       // フレームの大きさを設定
		int w = 400;
		int h = 320;

    // フレームを作成
		JFrame frame = new JFrame();

		//  タイトル名を設定
		frame.setTitle( "サインカーブ" );


		// 内側フレームの大きさを設定
		frame.getContentPane().setPreferredSize( new Dimension( w, h ) );
		frame.pack();

		// ”×”ボタンを押した時の処理を設定
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

		// フレームにパネルを追加
		MyPanel panel = new MyPanel();
		frame.getContentPane().add( panel );

		// フレームを表示
		frame.setVisible( true );
	}
}

 class MyPanel extends JPane:{
 public MyPanel(){
 setBackground( Color.white );
{

private int line_lyf f(double x)
 double rad = Math.toRadians(x) ;
 return Math.sin(rad);

private int line_x = 0
private int line_y = 0:

private void moveTo( int x, int y )
{
line_x1 = x;
line_y1 = y;
}

public void paintComponet(Graphis g)
 super.paintComponent( g );

 int frame_w = getWidth();
		int frame_h = getHeight();

Transformation2d trans = new Transformation2d();

trans.set( -360.0, 1.2, 360, -1.2, 0.0, 0.0,
			 (double)( frame_w - 1 ),  (double)( frame_h - 1 ) );

double origin_x = trans.getX( 0.0 );
		double origin_y = trans.getY( 0.0 );

g.setColor( Color.black );

g.drawLine( 0,  (int)origin_y, frame_w - 1,  (int)origin_y );

g.drawLine(  (int)origin_x, 0,  (int)origin_x, frame_h - 1 );

g.setColor( Color.red );

boolean isStart = true;
		for ( int x = -360; x <= 360; x++ ) {

double y = f(  (double)x );

int px =  (int)trans.getX(  (double)x );
			int py =  (int)trans.getY( y );

if ( true == isStart ) {
				moveTo( px, py );
				isStart = false;
			}
			else
				lineTo( g, px, py );
	}
	}
}
