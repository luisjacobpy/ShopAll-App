package com.ljhernandez.shopAll.service;

import com.ljhernandez.shopAll.data.DetallesPedido;
import com.ljhernandez.shopAll.data.dto.DetallesPedidoDto;
import com.ljhernandez.shopAll.repository.DetallesPedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetallesPedidoService {

    @Autowired
    private DetallesPedidoRepository detallesPedidoRepository;

    public DetallesPedidoDto convertirADto(DetallesPedido detallesPedido) {
        DetallesPedidoDto detallesPedidoDto = new DetallesPedidoDto();

        detallesPedidoDto.setIdDetallesPedido(detallesPedido.getIdDetallesPedido());
        detallesPedidoDto.setIdPedido(detallesPedido.getIdPedido().getIdPedido());
        detallesPedidoDto.setIdProducto(detallesPedido.getIdProducto().getIdProducto());
        detallesPedidoDto.setCantidad(detallesPedido.getCantidad());
        detallesPedidoDto.setPrecioUnitario(detallesPedido.getPrecioUnitario());
        detallesPedidoDto.setTotal(detallesPedido.calcularTotal());  // Suponiendo que DetallesPedido tiene un método calcularTotal()

        return detallesPedidoDto;
    }
}
