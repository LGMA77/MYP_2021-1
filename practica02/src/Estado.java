/**
 * Interface Estado. Define los diferentes estados que puede tener el Robot.
 * @author Luis Geovanni Mendez Avila
 */
public interface Estado{

	public void activar();
	public void suspender();
	public void caminar();
	public void trabajar(Casa casa);
	public void abastecer();
	public void recibirOrden();
}