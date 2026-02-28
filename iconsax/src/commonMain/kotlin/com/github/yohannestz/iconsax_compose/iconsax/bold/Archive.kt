package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Archive: ImageVector
    get() {
        val current = _archive
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Archive",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.82f, y = 2.0f)
                horizontalLineTo(x = 7.18f)
                arcToRelative(a = 3.87f, b = 3.87f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.86f, dy1 = 3.86f)
                verticalLineToRelative(dy = 14.09f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.8f, dx2 = 1.29f, dy2 = 2.56f, dx3 = 2.87f, dy3 = 1.69f)
                lineToRelative(dx = 4.88f, dy = -2.71f)
                arcToRelative(a = 2.1f, b = 2.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.87f, dy1 = 0.0f)
                lineToRelative(dx = 4.88f, dy = 2.71f)
                curveToRelative(dx1 = 1.58f, dy1 = 0.88f, dx2 = 2.87f, dy2 = 0.12f, dx3 = 2.87f, dy3 = -1.69f)
                verticalLineTo(y = 5.86f)
                arcTo(horizontalEllipseRadius = 3.9f, verticalEllipseRadius = 3.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 16.82f, y1 = 2.0f)
                moveToRelative(dx = -1.81f, dy = 7.75f)
                arcToRelative(a = 9.0f, b = 9.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -6.02f, dy1 = 0.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.45f, dy1 = -0.96f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.97f, dy1 = -0.45f)
                arcToRelative(a = 7.4f, b = 7.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 4.99f, dy1 = 0.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.51f, dy1 = 1.41f)
            }
        }.build().also { _archive = it }
    }

@Suppress("ObjectPropertyName")
private var _archive: ImageVector? = null
