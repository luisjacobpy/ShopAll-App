## Relaciones tablas / Entidades

### Tablas no dependientes
* usuario
* categoria



### Tablas dependientes

* `mediosPago` | Recibe `idUsuario` de la tabla `usuario` | ManyToOne
* `producto` | Recibe `idCategoria` de la tabla `categoria` | ManyToOne
* `detallesPedido` | Recibe `idProducto` de la tabla producto | ManyToOne | & Recibe `idPedido` de la tabla `pedido` ManyToOne
* `carrito` Recibe `idUsuario` de la tabla `usuario` ManyToOne
* `detallescarrito` Recibe `idCarrito` de la tabla `carrito` ManyToOne & Recibe `idProducto` de la tabla `producto` ManyToOne

* `detallesInventario` Recibe `IDProducto` de la tabala `producto` ManyToOne & Recibe `IDVendedor` de la tabla `informacionVendedor` ManyToOne.
* `informacionVendedor` | Recibe `idUsuario` de la tabla `usuario` ManyToOne
* `detallesInventario` | Recibe `IDVendedor` del campo `idInformacionVendedor`
* `busquedaProductos` | Recibe `idProducto` de la tabla `producto`
* `tienda` Recibe `udUsuario` de la tabla `usuario` ManyToOne


## Relacion ManyToOne
```java

@ManyToOne
@JoinColumn(name="cue_moneda")
Moneda moneda;

```

## Relación OneToMany
```java

@OneToMany(mappedBy="moneda")
List<Cuenta> cuentaList;

```
Implementación para que desde la clase bancos yo tenga acceso a todas las cuentas que están asociadas.
Si yo qquiero desde la clase moneda poder acceder a todas las cuentas que están asociadas a esa moneda puedo especificar en una `List`, una moneda puede tener varias listas. Puedo utilizar un List o un Set. Si uso List la misma cuenta se va a poder repetir.

Para usar el OneToMany del otro lado tenemos que utilizar un ManyToOne


## Otra manera de gestionar el OneToMany
```Java
@OneToMany(cascade = CascadeType.ALL)
private List<Reserva> reservas = ArrayList
 // Para que Java con JPA se encargue de todo lo que tiene que ver con la relación, si nosotros eliminamos un Huesped, toda la información de ese Huesped junto con sus reservaciones se va a eliminnar en cascada.
```