package utils;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;


public class ImageCode{
	public String getCode(ByteArrayOutputStream out) {
		int width = 30*4;
		int height = 30;
		
		//���ڴ洴��һ��ͼƬ
		BufferedImage image = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
		
		// 2.��û�ͼ����
		Graphics graphics = image.getGraphics();
		//3.���Ʊ�����ɫ
		graphics.setColor(Color.white);
		graphics.fillRect(0, 0, width, height);
		//4������ͼƬ�߿�
		graphics.setColor(Color.white);
		graphics.fillRect(0, 0, width-1, height-1);
		// 5�������֤������
		graphics.setColor(Color.black);
		graphics.setFont(new Font("����",Font.ITALIC,20));
		// ������4���ַ�
		Graphics2D graphics2d = (Graphics2D) graphics;
		String s = "ABCDEFGHIGKLMNOPQRSTUVWXYZ01234567890";
		Random random = new Random();
		String msg = "";
		int x = 5;
		for (int i = 0; i < 4; i++) {
			int index = random.nextInt(26);
			String content = String.valueOf(s.charAt(index));
			msg += content;
			double theta = random.nextInt(45) * Math.PI / 180;
			graphics2d.rotate(theta, x, 18);
			graphics2d.drawString(content, x, 18);
			graphics2d.rotate(-theta, x, 18);
			x += 30;
		}

		// // 6�����Ƹ�����

/*		for (int i = 0; i < 10; i++) {

			int r = random.nextInt(255);
			int g = random.nextInt(255);
			int b = random.nextInt(255);
			graphics.setColor(new Color(r, g, b));
			int x1 = random.nextInt(width);
			int x2 = random.nextInt(width);

			int y1 = random.nextInt(height);
			int y2 = random.nextInt(height);
			graphics.drawLine(x1, y1, x2, y2);
		}*/

		// �ͷ���Դ
		graphics.dispose();
		//�������ɵ�ͼƬ
		try {
			ImageIO.write(image, "jpg", out);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//�������ɵ���֤��
		return msg;
	} 
}
