package com.raulagendador.usuario.business;

import com.raulagendador.usuario.business.converter.UsuarioConverter;
import com.raulagendador.usuario.business.dto.UsuarioDTO;
import com.raulagendador.usuario.infrastructure.entity.Usuario;
import com.raulagendador.usuario.infrastructure.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final UsuarioConverter usuarioConverter;

    public UsuarioDTO salvaUsuario(UsuarioDTO usuarioDTO){
        Usuario usuario = usuarioConverter.paraUsuario(usuarioDTO);
        return usuarioConverter.paraUsuarioDTO(usuarioRepository.save(usuario));
    }
}
