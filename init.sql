-- 데이터베이스는 docker-compose.yml에서 이미 생성됨 (myappdb)
-- 테이블 생성
CREATE TABLE IF NOT EXISTS users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    address VARCHAR(100) UNIQUE NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
    );

-- 샘플 데이터 삽입
INSERT INTO users (name, address) VALUES
                ('홍길동', 'hong@test.com'),
                ('김철수', 'kim@test.com'),
                ('이영희', 'lee@test.com');
