class StarRunner{
 public static void main(String[] args){
	Star star1=new Star();
	Star star2=new Star();
	Star star3=new Star();
	Star star4=new Star();
	Star star5=new Star();
	Star star6=new Star();
	Star star7=new Star();
	Star star8=new Star();
	Star star9=new Star();
	Star star10=new Star();
	
star1.size=10;star1.brightness=7.002;star1.type="White Star";star1.visible=true;
star2.size=12;star2.brightness=25.4;star2.type="Main Sequence";star2.visible=true;
star3.size=900;star3.brightness=126000;star3.type="Red Supergiant";star3.visible=false;
star4.size=1;star4.brightness=0.0017;star4.type="Red Dwarf";star4.visible=true;
star5.size=3;star5.brightness=40;star5.type="White Main Sequence";star5.visible=true;
star6.size=1;star6.brightness=1.519;star6.type="Yellow Dwarf";star6.visible=true;
star7.size=1;star7.brightness=0.5;star7.type="Orange Dwarf";star7.visible=true;
star8.size=25;star8.brightness=170;star8.type="Red Giant";star8.visible=true;
star9.size=38;star9.brightness=2000;star9.type="Yellow Supergiant";star9.visible=true;
star10.size=79;star10.brightness=120000;star10.type="Blue Supergiant";star10.visible=true;

System.out.println("Star 1: Size="+star1.size+", Brightness="+star1.brightness+", Type="+star1.type+", Visible="+star1.visible);
System.out.println("Star 2: Size="+star2.size+", Brightness="+star2.brightness+", Type="+star2.type+", Visible="+star2.visible);
System.out.println("Star 3: Size="+star3.size+", Brightness="+star3.brightness+", Type="+star3.type+", Visible="+star3.visible);
System.out.println("Star 4: Size="+star4.size+", Brightness="+star4.brightness+", Type="+star4.type+", Visible="+star4.visible);
System.out.println("Star 5: Size="+star5.size+", Brightness="+star5.brightness+", Type="+star5.type+", Visible="+star5.visible);
System.out.println("Star 6: Size="+star6.size+", Brightness="+star6.brightness+", Type="+star6.type+", Visible="+star6.visible);
System.out.println("Star 7: Size="+star7.size+", Brightness="+star7.brightness+", Type="+star7.type+", Visible="+star7.visible);
System.out.println("Star 8: Size="+star8.size+", Brightness="+star8.brightness+", Type="+star8.type+", Visible="+star8.visible);
System.out.println("Star 9: Size="+star9.size+", Brightness="+star9.brightness+", Type="+star9.type+", Visible="+star9.visible);
System.out.println("Star 10: Size="+star10.size+", Brightness="+star10.brightness+", Type="+star10.type+", Visible="+star10.visible);
 }
}