
import pygame
import time
import sys

# Initialize Pygame
pygame.init()

# Set up some constants
WIDTH, HEIGHT = 800, 800
DIMENSION = 8
SQ_SIZE = HEIGHT // DIMENSION
MAX_FPS = 15  # for animation
IMAGES = {}

# Initialize a dictionary of images
def loadImages():
    pieces = ['wp', 'bp', 'wR', 'bR', 'wN', 'bN', 'wB', 'bB', 'wQ', 'bQ', 'wK', 'bK']
    for piece in pieces:
        IMAGES[piece] = pygame.image.load('images/' + piece + '.png')

# Returns a list of all valid moves for a given piece
def getAllPossibleMoves(piece, board):
    moves = []
    if piece.type == 'p':
        if piece.team == 'w':
            moves = getWhitePawnMoves(piece, board)
        else:
            moves = getBlackPawnMoves(piece, board)
    elif piece.type == 'R':
        moves = getRookMoves(piece, board)
    elif piece.type == 'N':
        moves = getKnightMoves(piece, board)
    elif piece.type == 'B':
        moves = getBishopMoves(piece, board)
    elif piece.type == 'Q':
        moves = getQueenMoves(piece, board)
    elif piece.type == 'K':
        moves = getKingMoves(piece, board)
    return moves

# Determine all possible squares a knight can move to
def getKnightMoves(piece, board):
    moves = []
    # Add all possible knight moves
    for r in range(1, 3):
        for c in range(1, 3):
            if r + piece.row < 8 and c + piece.col < 8:
                if (board[r + piece.row][c + piece.col] == '  ' or
                        board[r + piece.row][c + piece.col][0] != piece.team):
                    moves.append((r + piece.row, c + piece.col))
    return moves

# Determine all possible squares a bishop can move to
def getBishopMoves(piece, board):
    moves = []
    # Add all possible bishop moves
    for i in range(1, 8):
        if piece.row + i < 8 and piece.col + i < 8:
            if board[piece.row + i][piece.col + i] == '  ':
                moves.append((piece.row + i, piece.col + i))
            elif board[piece.row + i][piece.col + i][0] != piece.team:
                moves.append((piece.row + i, piece.col + i))
                break
        if piece.row - i >= 0 and piece.col + i < 8:
            if board[piece.row - i][piece.col + i] == '  ':
                moves.append((piece.row - i, piece.col + i))
            elif board[piece.row - i][piece.col + i][0] != piece.team:
                moves.append((piece.row - i, piece.col + i))
                break
        if piece.row + i < 8 and piece.col - i >= 0:
            if board[piece.row + i][piece.col - i] == '  ':
                moves.append((piece.row + i, piece.col - i))
            elif board[piece.row + i][piece.col - i][0] != piece.team:
                moves.append((piece.row + i, piece.col - i))
                break
        if piece.row - i >= 0 and piece.col - i >= 0:
            if board[piece.row - i][piece.col - i] == '  ':
                moves.append((piece.row - i, piece.col - i))
            elif board[piece.row - i][piece.col - i][0] != piece.team:
                moves.append((piece.row - i, piece.col - i))
                break
    return moves

# Determine all possible squares a rook can move to
def getRookMoves(piece, board):
    moves = []
    # Add all possible rook moves
    for i in range(1, 8):
        if piece.row + i < 8:
            if board[piece.row + i][piece.col] == '  ':
                moves.append((piece.row + i, piece.col))
            elif board[piece.row + i][piece.col][0] != piece.team:
                moves.append((piece.row + i, piece.col))
                break
        if piece.row - i >= 0:
            if board[piece.row - i][piece.col] == '  ':
                moves.append((piece.row - i, piece.col))
            elif board[piece.row - i][piece.col][0] != piece.team:
                moves.append((piece.row - i, piece.col))
                break
        if piece.col + i < 8:
            if board[piece.row][piece.col + i] == '  ':
                moves.append((piece.row, piece.col + i))
            elif board[piece.row][piece.col + i][0] != piece.team:
                moves.append((piece.row, piece.col + i))
                break
        if piece.col - i >= 0:
            if board[piece.row][piece.col - i] == '  ':
                moves.append((piece.row, piece.col - i))
            elif board[piece.row][piece.col - i][0] != piece.team:
                moves.append((piece.row, piece.col - i))
                break
    return moves

# Determine all possible squares a queen can move to
def getQueenMoves(piece, board):
    moves = getRookMoves(piece, board)

# Determine all possible squares a king can move to
def getKingMoves(piece, board):
    moves = []
    # Add all possible king moves
    for i in range(-1, 2):
        for j in range(-1, 2):
            if i == 0 and j == 0:
                continue
            if piece.row + i < 8 and piece.col + j < 8:
                if board[piece.row + i][piece.col + j] == '  ' or board[piece.row + i][piece.col + j][0] != piece.team:
                    moves.append((piece.row + i, piece.col + j))
    return moves

# Determine all possible squares a pawn can move to
def getWhitePawnMoves(piece, board):
    moves = []
    if board[piece.row - 1][piece.col] == '  ':
        moves.append((piece.row - 1, piece.col))
    if piece.row == 6:
        if board[piece.row - 1][piece.col] == '  ' and board[piece.row - 2][piece.col] == '  ':
            moves.append((piece.row - 2, piece.col))
    if piece.col - 1 >= 0:
        if board[piece.row - 1][piece.col - 1][0] != piece.team:
            moves.append((piece.row - 1, piece.col - 1))
    if piece.col + 1 < 8:
        if board[piece.row - 1][piece.col + 1][0] != piece.team:
            moves.append((piece.row - 1, piece.col + 1))
    return moves

def getBlackPawnMoves(piece, board):
    moves = []
    if board[piece.row + 1][piece.col] == '  ':
        moves.append((piece.row + 1, piece.col))
    if piece.row == 1:
        if board[piece.row + 1][piece.col] == '  ' and board[piece.row + 2][piece.col] == '  ':
            moves.append((piece.row + 2, piece.col))
    if piece.col - 1 >= 0:
        if board[piece.row + 1][piece.col - 1][0] != piece.team:
            moves.append((piece.row + 1, piece.col - 1))
    if piece.col + 1 < 8:
        if board[piece.row + 1][piece.col + 1][0] != piece.team:
            moves.append((piece.row + 1, piece.col + 1))
    return moves

# Main game loop
def main():
    screen = pygame.display.set_mode((WIDTH, HEIGHT))
    clock = pygame.time.Clock()
    loadImages()
    board = initializeBoard()
    player_clicks = []
    game_over = False
    player = 0
    while not game_over:
        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                sys.exit()
            if event.type == pygame.MOUSEBUTTONDOWN:
                location = pygame.mouse.get_pos()
                col = location[0] // SQ_SIZE
                row = location[1] // SQ_SIZE
                if player == 0:
                    player_clicks.append((row, col))
                else:
                    result = makeMove(player_clicks[0], (row, col), board)
                    if result[0]:
                        player_clicks = []
                        player = 1 - player
                    else:
                        player_clicks = [(row, col)]
        drawBoard(screen, board)
        pygame.display.flip()
        clock.tick(MAX_FPS)

# Initialize the board
def initializeBoard():
    board = []
    for i in range(DIMENSION):
        board.append(['  ' for j in range(DIMENSION)])
    return board

# Draw the board
def drawBoard(screen, board):
    global colors
    colors = [(255, 255, 255), (160, 160, 160)]
    for r in range(DIMENSION):
        for c in range(DIMENSION):
            pygame.draw.rect(screen, colors[((r + c) % 2)],
                             pygame.Rect(c * SQ_SIZE, r * SQ_SIZE, SQ_SIZE, SQ_SIZE))
            if board[r][c] != '  ':
                screen.blit(IMAGES[board[r][c]], pygame.Rect(c * SQ_SIZE, r * SQ_SIZE, SQ_SIZE, SQ_SIZE))

# Make a move on the board
def makeMove(start, end, board):
    piece = board[start[0]][start[1]]
    board[start[0]][start[1]] = '  '
    board[end[0]][end[1]] = piece
    return True

# Run the game
main()
