package io.portfolio;

public final class DomainReviewTest {
    public static void main(String[] args) {
        var item = new DomainReview.Item(80, 54, 21, 58);
        if (DomainReview.score(item) != 209) throw new AssertionError("domain score mismatch");
        if (!DomainReview.lane(item).equals("ship")) throw new AssertionError("domain lane mismatch");
    }
}
