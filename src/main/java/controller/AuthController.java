package controller;

import com.example.shareit.dto.RegisterRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @PostMapping("/signup")
    public void signup(@RequestBody RegisterRequest registerRequest) {

    }
}
