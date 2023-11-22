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
