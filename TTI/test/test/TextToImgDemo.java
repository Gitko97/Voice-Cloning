package test;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.*;
import textToImage.Note;
import textToImage.PdfAndImg;
import textToImage.TextToImg;

public class TextToImgDemo {
  public static void main(String[] args) throws Exception {
    String[] sttstring = {"how", " ", "", "what ever you do", " we naver give up", " and gonna fight for this", " will bite you", "  and also youll be diffeted", "  �븵�꽌 �궗�엺�뱾�씠 洹몃옱�쓣 嫄곕씪怨� �굹�뒗", "  �씠�젣 �깂�떎", "  �떎�뻾�뻽�쓣 ", " 遺꾨━�븷 �닔 �엳�뒗", "  �냼�봽�듃", "  �뵒�젨�쓽 �쁽�� �썝移숈쑝濡� 遺꾨쪟�븷 �닔 �엳�뒗", "  洹몃윴", "  寃껋뿉 ���빐�꽌 怨듬�瑜�", "  �븳���슂 洹몃옒�꽌 洹몃쭔�겮", "  �씠�젣 �옄二� �벐�씠�뒗 �븯怨�", "  �씠�젣", "  �뵒�옄�씤�뙣�꽩 遺꾩빞�뿉�꽌�뒗", "  �뼱 洹몃옒 �뒪�봽�젅�뱶 �뜑 留롮씠 �벐�씠�뒗", "  洹몃윴", "  �봽�젅�뒪�븘�뱶�뿉 ���빐�꽌 �슦由ш�","  �븣�븘蹂� �삁�젙�씤�뜲 洹�", "  以묒뿉�꽌�룄", "  �넄由щ뱶�씪怨� �븯�뒗 �궇�뵪 留덊떚�땲", "  洹�", "  �젙由ы븳", "  洹몃윴 �봽由곗뒪踰좊쿋 �꽌�슱", "  �썝移숈뿉 ���빐�꽌", "  �썝移숈뿉 ���빐�꽌 �궡�렣蹂대룄濡� �븯寃좎뒿�땲�떎", "  �뿬�윭遺꾨뱾", "  �굹瑜명븳 援먭낵�꽌�뿉�꽌�뒗", "  �씠�젣", "  �뵒�옄�씤�뙣�꽩", "  �뵒�옄�씤�뙣�꽩�쓣 ���빐�꽌 媛꾨왂�븯寃� �뼵湲됱쓣","  �븯怨� �엳�뒗�뜲","  �궗�떎�� �씤�젣 �슦由ш�","  援먭낵 怨쇱젙","  3 4�븰�뀈 2�븰湲� �븣","  �꽕怨꾪뙣�꽩�씠�씪怨�","  �븯�뒗�뜲 怨쇰ぉ�씠 �뵲濡� �엳怨�","  洹� 媛먯삦�뿉�꽌","  �뼲�뼇�쓣","  �룷�뿕�뵒�옄�씤 �뙣�꽩�뱾","  23�씪 媛�吏��뿉 ���빐�꽌 �옄�꽭"," �븯寃뚯뿉 ���빐"," �봽�젋利�","  �봽�젋利� �뵒�옄"," �씤�뙣�꽩�쓣 �씠�빐�븯"," 湲� �쐞�빐�꽌","  �뿰�븘�뿉 ���빐 �븣�븘�빞 �릺�뒗 洹몃윴","  �꽕怨� 愿��젴�맂","  湲곕낯�쟻�씤","  �썝移숈씠�씪怨좊룄 蹂댁떆硫� �릺寃좎뒿�땲�떎","  洹몃옒�꽌","  �넄由щ뱶","  ���빐�꽌 �씠�젣 �슦由ш�","  怨듬� �빐 蹂대룄濡� �븯怨�","  20 �옄�꽭�븳","  �궡�슜�� �젣媛� �씠�젣","  蹂꾩꺼�쑝濡�","  �뱶�뒗","  �룧由щ뒗 �봽由곗뒪�럹 愿��젴�맂","  �븘�떚�겢�뿉 �씫�뼱蹂댁��뒗","  �넄由щ뱶�봽濡� �뼱�뼡","  �궡�슜�쓣 �떞怨� �엳�뒗吏� 洹몃━怨�","  �뒪耳�以� �뼱�뼸寃�","  �릺�뒗吏�","  �뜑 �옄�꽭�엳 蹂� �닔媛� �엳寃좎뒿�땲�떎","  �슦由� 4�븰�뀈 2�븰湲�","  �븣","  �꽕怨꾪뙣�꽩�씠�씪怨�","  �븯�뒗 諛⑸쾿�쓣 諛곗슫�떎 洹몃옱二�","  洹몃옒�꽌 �뙣�꽩�뿉�꽌�뒗","  �뤌 紐⑺룷�뿉","  �뵒�옄�씤�뙣�꽩","  23媛�吏��쓽","  �뵒�옄�씤�뙣�꽩�쓣 �젙由щ씪怨� �엳�뒗�뜲","  洹� 以묒뿉 �븳 媛�吏��뒗","  �뿴�벑�쟾�왂 諛고꽣由� �릺寃좎뒿�땲�떎 �쟾�왂�뙣�꽩 �궡�슜�� 媛꾨떒�븯寃�","  �젙由ы빐�꽌 蹂몃떎硫�","  2�젅 �굹���궡�뒗 寃껋�","  �븣怨좊━利섏뿉 遺꾨뱾","  �젙�빐 �씪怨좎슂","  洹몃━怨� 洹몃윭�븳 �븣怨좊━利섎뱾�쓣","  �쐞梨� �뒳�젅�씠�듃 媛뽮퀬","  媛곴컖�쓽 �븣怨좊━利섎뱾�쓣","  �꽌濡�"," 蹂��솕"," �떆�궗 �닔","  �엳寃�","  �맆 �닔 �엳寃�","  留뚮뱾�뼱","  以띾땲�떎","  寃곌뎅��","  �쟾�왂�뙣�꽩 �궗�슜�븯寃�","  �릺硫�","  �겢�씪�씠�뼵�듃媛�","  �궗�슜�븯怨� �엳�뒗","  洹몃윴","  �븣怨좊━利섎뱾�씠","  �겢�씪�씠�뼵�듃��","  蹂꾧컻濡�","  �룆由쎌쟻�쑝濡�","  蹂��븷 �닔 �엳寃좎�","  �븣怨좊━利섏뿉","  蹂�寃쏀빐","  寃껋쓣 �궗�슜�븯怨� �엳�뒗","  �겢�씪�씠�뼵�듃 �쁺�뼢�쓣 誘몄튂吏� �븡�뒗�떎�뒗 �쑜�씠寃좎짛","  留뚮뱾�뼱吏묐땲�떎","  �옄 �씠�젃寃� �씠�젣 �슦由� �뼱�븣 紐⑺룷�뿉","  �뵒�옄�씤�뙣�꽩�쓣 �젙�젹�븷 �닔 �엳寃좊뒗�뜲","  �궗�떆�뒗 �씠�젃寃뚮쭔 怨듬�瑜�","  �븳�떎硫� ���떒�엳","  遺�議깊븳","  洹몃━怨�","  �엳�뒗","  洹몃윴 �뵒�옄�씤","  怨듬��엯�땲�떎","  �솢�깘硫� �씠嫄� 媛숈� �젅踰⑥뿉�꽌�쓽","  �뵒�옄�씤�뙣�꽩�쓣 移섏쭏�� �뼱�뼡"," �쁽�떎�뿉�꽌 �씪�뼱"," �굹�뒗","  洹몄쇅�뵒�옄�씤","  臾몄젣�뿉 �엳�뼱�꽌","  洹몃윴 遺��옣�떂 �젣媛�","  理쒓렐�뿉 �굹�삩","  寃쎌슦 梨낆뿉 �굹�삩","  洹몃윴","  寃껊뱾怨� 議곌툑留� ���뼱吏�嫄곕굹","  �샊��","  �빟媛꾩쓽","  �솗�옣�쓣","  �슃�븷 �븣 �븯�뒗","  嫄곗짛 洹몃옒�꽌","  �삤�뒛��","  醫뗭� �뵒�옄�씤�쓣","  諛곗슦�뒗","  �닚媛꾩뿉�뒗","  �뵒�옄�씤�뙣�꽩 留�","  諛곗슦硫� 異⑸텇�븳 寃껋씠 �븘�땲�씪","  洹멸쾬�쓣","  �꽌�룷�듃�븯怨� �엳�뒗 嫄�","  媛숈��뜲","  留뚮뱾�뼱�빞 �뤌 �뜑","  洹쇰낯�쟻�씤","  媛앹껜吏��뼢�꽦�씠 �썝移숈쓣 �뿰�떖�븘�엯�땲�떎","  諛곗썱�뜕 湲��씪�뒪�씫 �뙣�꽩�룄","  媛앹껜吏��뼢 �꽕怨� �썝移�","  �븣�븘蹂� �닔媛� �뾾怨좎슂 �븘�땲�씪�뒗 寃껋쓣","  �꽌�룷�듃�븯怨� �엳�뒗"};
	ArrayList<String> sttarray = new ArrayList<>(Arrays.asList(sttstring));
	ArrayList<Integer> change = new ArrayList<>();;
	change.add(50); // �꽕怨� 愿��젴�맂~
	change.add(70);
	ArrayList<Point> index = new ArrayList<>();
	index.add(new Point(6, 10));  //�븵�꽌 �궗�엺�뱾�씠 洹몃옱�쓣 嫄곕씪怨�~
	index.add(new Point(30, 36));  //�뿬�윭遺꾨뱾","  �굹瑜명븳 援먭낵�꽌�뿉�꽌�뒗","  �씠�젣","  �뵒�옄�씤�뙣�꽩~
	index.add(new Point(50, 55));
	index.add(new Point(60, 70));  // �뱶�뒗~
	System.out.println(sttstring[50]);
	System.out.println(sttstring[70]);
		
	ArrayList<Note> notes = new ArrayList<>();
	ArrayList<BufferedImage> imgs = new ArrayList<>();
	PdfAndImg pdfandimg = new PdfAndImg();
	try {
	  imgs = pdfandimg.PdfToImg("test/test/0.pdf");
	  int i = 0;
	  for(BufferedImage note : imgs) {
	    notes.add(new Note(note, index.get(i).x, index.get(i).y));
		i++;
	  }
	} catch (IOException e) {
	  e.printStackTrace();
	}
	TextToImg textToimg = new TextToImg(sttarray, notes, change, imgs.get(0).getWidth(), imgs.get(0).getHeight());
	// textToImg �떎�뻾
	imgs = textToimg.convert();
	pdfandimg.ImgToPdf(imgs, "test/test/test.pdf");
  }
}