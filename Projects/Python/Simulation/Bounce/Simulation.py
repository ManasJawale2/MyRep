import random
import time
import pygame

def Start(x, y):
    pygame.init()

    pygame.display.set_caption("Simulation.Bounce")
    screen = pygame.display.set_mode((1280, 720))
    screen.fill((0, 0, 0))

    def Render(Text):
        return pygame.font.SysFont("Verdana", 16).render(Text, True, (255, 255, 255))

    G = 9

    x,y = random.randint(75, 1280-75), random.randint(75, 700-75)
    Vx, Vy = 1 , .75
    circle = pygame.Rect(x, y, 150, 150)

    # Box = pygame.Rect(500, 250, 100, 50)

    points = [(circle.x+150/2, circle.y+150/2)]

    acY = .25
    done = False

    startime = time.time()
    currtime = time.time()

    label  = Render(  f"X:{x}")
    label2 = Render(  f"Y:{y}")
    label3 = Render(f"Vx:{Vx}")
    label4 = Render(f"Vy:{Vy}")
    label5 = Render(f"Time:{currtime-startime}")

    while not done:
        # pygame.time.delay(5)
        currtime = time.time()
        label5 = Render(f"Time:{str(currtime-startime)[0:4]}")
        label  = Render(f"X:{str(x)[0:5]}")
        label2 = Render(f"Y:{str(y)[0:5]}")
        label3 = Render(f"Vx:{str(Vx)[0:5]}")
        label4 = Render(f"Vy:{str(Vy)[0:5]}")
        Vy += acY
        # Vx -= .001 if Vx > 0 else -.001
        # Vx -= .01 if Vx > 0 else -.1
        y += Vy
        x += Vx
        circle = pygame.Rect(x, y, 150, 150)

        if y + 150 > 720:
            Vy *= -1
        elif y + 150 == 720:
            Vy = 0
            acY = 0
        if y <= 0:
            Vy *= -1
        if x + 150 >= 1280:
            Vx *= -.75
        if x <= 0:
            Vx *= -.75
        # if circle.colliderect(Box):
            # Vy = -Vy
            # Vx = -Vx
        points.append((circle.x+150/2, circle.y+150/2))
        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                done = not done
        screen.fill((0, 0, 0))
        screen.blit(label, (0, 16))
        screen.blit(label2, (0, 32))
        screen.blit(label3, (0, 48))
        screen.blit(label4, (0, 64))
        screen.blit(label5, (0, 80))
        pygame.draw.rect(screen, (255, 255, 255), circle, border_radius=100)
        # pygame.draw.rect(screen, (255, 255, 255), Box)
        pygame.draw.line(screen, (255, 0, 0), (circle.x+150/2, circle.y+150/2), (circle.x+150/2, circle.y+150/2))
        if Vy == 0 and y == 570:
            for i in range(len(points)):
                pygame.draw.line(screen, (255, 0, 0), points[i], points[i])
                pygame.display.update()
            pygame.time.delay(5000)
            done = not done
        pygame.display.update()
