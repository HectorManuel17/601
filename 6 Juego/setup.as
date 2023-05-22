package  {
	
	import flash.display.MovieClip;
	
	
	public class setup extends MovieClip {  //firma
		
		private var fondo_new: Fondo = new Fondo (); //metodo constructor
		private var piso_new: Piso = new Piso ();
		private var protagonista_new: Protagonista = new Protagonista();
		private var antagonista_new: Antagonista = new Antagonista ();
		
		
		public function setup() {
			
			addChild(fondo_new);
			addChild(piso_new);
			addChild(protagonista_new);
			addChild(antagonista_new);
			
			
			
			fondo_new.y = 200;
			fondo_new.x = 275;
			
			piso_new.y = 370;
			piso_new.x = 275;
			
			protagonista_new.y = 330;
			protagonista_new.x = 275;
			
			antagonista_new.y = 100;
			antagonista_new.x = 275;
			
			
			
		}
	}
	
}
