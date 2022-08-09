package com.example.entry.global.security.jwt;

import org.springframework.stereotype.Component;

@Component
public class JwtTokenFilter {

//    private final Logger log = LoggerFactory.getLogger(this.getClass());
//
//    private final JwtTokenProvider jwtTokenProvider;
//
//    @Override
//    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response,
//                                    FilterChain filterChain) throws ServletException, IOException {
//
//        String bearer = jwtTokenProvider.resolveToken(request);
//        if (bearer != null) {
//            Authentication authentication = jwtTokenProvider.authentication(bearer);
//            SecurityContextHolder.getContext().setAuthentication(authentication);
//        }
//        filterChain.doFilter(request, response);
//
//    }
}
