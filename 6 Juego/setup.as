package  {
	
	import flash.display.MovieClip;
	import flash.events.Event;
	
	
	
	public class setup extends MovieClip {  //firma
		
		private var fondo_new: fondo = new fondo (); //metodo constructor
		private var piso_new: piso = new piso ();
		static var protagonista_new: protagonista = new protagonista();
		private var antagonista_new: antagonista = new antagonista ();
		
		static var puntos: Number=0;
		static var puntos_box_new: puntos_box = new puntos_box();
		
		
		public function setup() {
			
			addChild(fondo_new);
			addChild(piso_new);
			addChild(protagonista_new);
			addChild(antagonista_new);
			
			addChild(puntos_box_new);
			puntos_box_new.x=100;
			puntos_box_new.y=40;
			puntos_box_new.puntostxt.text= String(puntos);
			
			
			
			fondo_new.y = 200;
			fondo_new.x = 275;
			
			piso_new.y = 370;
			piso_new.x = 275;
			
			protagonista_new.y = 330;
			protagonista_new.x = 275;
			
			antagonista_new.y = 100;
			antagonista_new.x = 275;
			
			this.addEventListener(Event.ENTER_FRAME,actualiza_puntos);
			
			
			
			
		}
		
		public function actualiza_puntos(e:Event){
			puntos_box_new.puntostxt.text =String(puntos);
		}
	}
	
}
