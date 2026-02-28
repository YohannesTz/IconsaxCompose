package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val HeartSearch: ImageVector
    get() {
        val current = _heartSearch
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.HeartSearch",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.0f, y = 20.9f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.62f, dy1 = -0.09f)
                curveTo(x1 = 8.48f, y1 = 19.82f, x2 = 2.0f, y2 = 15.7f, x3 = 2.0f, y3 = 8.68f)
                curveTo(x1 = 2.0f, y1 = 7.28f, x2 = 2.51f, y2 = 6.0f, x3 = 3.36f, y3 = 5.02f)
                moveTo(x = 21.49f, y = 12.0f)
                arcTo(horizontalEllipseRadius = 11.0f, verticalEllipseRadius = 11.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 22.0f, y1 = 8.7f)
                arcToRelative(a = 5.57f, b = 5.57f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -5.56f, dy1 = -5.6f)
                arcTo(horizontalEllipseRadius = 5.5f, verticalEllipseRadius = 5.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 5.34f)
                arcTo(horizontalEllipseRadius = 5.5f, verticalEllipseRadius = 5.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 7.56f, y1 = 3.1f)
                moveTo(x = 17.74f, y = 21.0f)
                arcToRelative(a = 3.2f, b = 3.2f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -6.4f)
                arcToRelative(a = 3.2f, b = 3.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 6.4f)
                moveToRelative(dx = 3.8f, dy = 0.6f)
                lineToRelative(dx = -1.0f, dy = -1.0f)
            }
        }.build().also { _heartSearch = it }
    }

@Suppress("ObjectPropertyName")
private var _heartSearch: ImageVector? = null
