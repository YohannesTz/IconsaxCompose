package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Threedcube: ImageVector
    get() {
        val current = _threedcube
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Threedcube",
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
                moveTo(x = 19.43f, y = 7.76f)
                curveToRelative(dx1 = 0.76f, dy1 = -0.41f, dx2 = 0.76f, dy2 = -1.58f, dx3 = 0.0f, dy3 = -1.99f)
                lineToRelative(dx = -6.51f, dy = -3.51f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.84f, dy1 = 0.0f)
                lineTo(x = 4.57f, y = 5.77f)
                curveToRelative(dx1 = -0.76f, dy1 = 0.41f, dx2 = -0.76f, dy2 = 1.58f, dx3 = 0.0f, dy3 = 1.99f)
                lineToRelative(dx = 6.51f, dy = 3.51f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.84f, dy1 = 0.0f)
                lineToRelative(dx = 2.34f, dy = -1.26f)
                moveTo(x = 2.0f, y = 11.12f)
                arcToRelative(a = 1.1f, b = 1.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.61f, dy1 = -0.99f)
                lineToRelative(dx = 6.05f, dy = 3.03f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.23f, dy1 = 2.0f)
                verticalLineToRelative(dy = 5.71f)
                arcToRelative(a = 1.1f, b = 1.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.61f, dy1 = 1.0f)
                lineToRelative(dx = -6.05f, dy = -3.04f)
                arcTo(horizontalEllipseRadius = 2.2f, verticalEllipseRadius = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 2.0f, y1 = 16.84f)
                verticalLineToRelative(dy = -1.88f)
                moveToRelative(dx = 18.39f, dy = -4.83f)
                lineToRelative(dx = -6.05f, dy = 3.03f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.23f, dy1 = 2.0f)
                verticalLineToRelative(dy = 5.71f)
                arcToRelative(a = 1.1f, b = 1.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.61f, dy1 = 1.0f)
                lineToRelative(dx = 6.05f, dy = -3.04f)
                arcTo(horizontalEllipseRadius = 2.2f, verticalEllipseRadius = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 22.0f, y1 = 16.84f)
                verticalLineToRelative(dy = -5.72f)
                arcToRelative(a = 1.1f, b = 1.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.61f, dy1 = -0.99f)
            }
        }.build().also { _threedcube = it }
    }

@Suppress("ObjectPropertyName")
private var _threedcube: ImageVector? = null
