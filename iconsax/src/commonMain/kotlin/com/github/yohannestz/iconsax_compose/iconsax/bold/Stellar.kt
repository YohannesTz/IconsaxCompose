package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Stellar: ImageVector
    get() {
        val current = _stellar
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Stellar",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 22.66f, y = 4.64f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.02f, dy1 = -0.3f)
                lineTo(x = 4.7f, y = 13.66f)
                arcTo(horizontalEllipseRadius = 8.0f, verticalEllipseRadius = 8.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 4.5f, y1 = 12.0f)
                arcToRelative(a = 7.5f, b = 7.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 11.46f, dy1 = -6.37f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.79f, dy1 = -1.27f)
                arcTo(horizontalEllipseRadius = 9.0f, verticalEllipseRadius = 9.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 3.0f)
                arcToRelative(a = 9.0f, b = 9.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -8.68f, dy1 = 11.39f)
                lineToRelative(dx = 0.01f, dy = 0.02f)
                lineToRelative(dx = -1.69f, dy = 0.93f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.72f, dy1 = 1.32f)
                lineToRelative(dx = 20.0f, dy = -11.0f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.3f, dy1 = -1.02f)
                moveToRelative(dx = 0.0f, dy = 3.5f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.02f, dy1 = -0.3f)
                lineTo(x = 19.53f, y = 9.0f)
                quadToRelative(dx1 = -0.05f, dy1 = 0.02f, dx2 = -0.1f, dy2 = 0.06f)
                lineTo(x = 1.64f, y = 18.84f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.72f, dy1 = 1.32f)
                lineToRelative(dx = 17.03f, dy = -9.37f)
                arcTo(horizontalEllipseRadius = 8.0f, verticalEllipseRadius = 8.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 19.5f, y1 = 12.0f)
                arcToRelative(a = 7.5f, b = 7.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -11.48f, dy1 = 6.36f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.03f, dy1 = 0.24f)
                arcToRelative(a = 0.74f, b = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.24f, dy1 = 1.03f)
                arcTo(horizontalEllipseRadius = 9.01f, verticalEllipseRadius = 9.01f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 21.01f, y1 = 12.0f)
                quadToRelative(dx1 = -0.02f, dy1 = -1.0f, dx2 = -0.24f, dy2 = -1.96f)
                lineToRelative(dx = 1.6f, dy = -0.88f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.29f, dy1 = -1.02f)
            }
        }.build().also { _stellar = it }
    }

@Suppress("ObjectPropertyName")
private var _stellar: ImageVector? = null
