 public class MercanciaAdaptada implements MenuItems{
	 
	Mercancia mercancia;

	public MercanciaAdaptada(){
	}

	@Override
	public String getNombre(){
		return this.mercancia.getNombre();
	}

	@Override
	public double getPrecio(){
		return this.mercancia.getPrecio();
	}

	@Override
	public String getDescripcion(){
		String descripcion = (this.mercancia.getNombre() + ", " + this.mercancia.getMaterial()+ ", "+
							 this.mercancia.getColor());

		return descripcion;
	}

	public MenuItem adaptar(Mercancia merca){
		this.mercancia = merca;
		MenuItem aux = new MenuItem(this.getNombre(), this.getDescripcion(), true, this.getPrecio());
		return aux;
	}

 }