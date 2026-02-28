package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Autobrightness: ImageVector
    get() {
        val current = _autobrightness
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Autobrightness",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 21.56f, y = 10.74f)
                lineToRelative(dx = -1.35f, dy = -1.58f)
                arcToRelative(a = 2.3f, b = 2.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.46f, dy1 = -1.26f)
                verticalLineTo(y = 6.2f)
                arcToRelative(a = 1.94f, b = 1.94f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.93f, dy1 = -1.93f)
                horizontalLineToRelative(dx = -1.7f)
                arcToRelative(a = 2.3f, b = 2.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.27f, dy1 = -0.46f)
                lineToRelative(dx = -1.58f, dy = -1.35f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.51f, dy1 = 0.0f)
                lineTo(x = 9.16f, y = 3.8f)
                arcTo(horizontalEllipseRadius = 2.3f, verticalEllipseRadius = 2.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 7.9f, y1 = 4.27f)
                horizontalLineTo(x = 6.17f)
                arcTo(horizontalEllipseRadius = 1.94f, verticalEllipseRadius = 1.94f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 4.24f, y1 = 6.2f)
                verticalLineToRelative(dy = 1.7f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.39f, dx2 = -0.2f, dy2 = 0.95f, dx3 = -0.45f, dy3 = 1.25f)
                lineToRelative(dx = -1.35f, dy = 1.59f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 2.5f)
                lineToRelative(dx = 1.35f, dy = 1.59f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.45f, dy1 = 1.25f)
                verticalLineToRelative(dy = 1.7f)
                arcToRelative(a = 1.94f, b = 1.94f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.93f, dy1 = 1.94f)
                horizontalLineToRelative(dx = 1.74f)
                arcToRelative(a = 2.3f, b = 2.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.26f, dy1 = 0.46f)
                lineToRelative(dx = 1.58f, dy = 1.35f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.51f, dy1 = 0.0f)
                lineToRelative(dx = 1.58f, dy = -1.35f)
                arcToRelative(a = 2.3f, b = 2.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.26f, dy1 = -0.46f)
                horizontalLineToRelative(dx = 1.7f)
                arcToRelative(a = 1.94f, b = 1.94f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.93f, dy1 = -1.93f)
                verticalLineToRelative(dy = -1.7f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.4f, dx2 = 0.21f, dy2 = -0.96f, dx3 = 0.46f, dy3 = -1.26f)
                lineToRelative(dx = 1.35f, dy = -1.58f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.02f, dy1 = -2.51f)
                moveToRelative(dx = -6.75f, dy = 5.5f)
                lineToRelative(dx = -0.98f, dy = -2.2f)
                lineToRelative(dx = -0.09f, dy = 0.02f)
                horizontalLineToRelative(dx = -3.5f)
                lineToRelative(dx = -0.09f, dy = -0.02f)
                lineToRelative(dx = -0.98f, dy = 2.2f)
                lineToRelative(dx = -1.37f, dy = -0.61f)
                lineToRelative(dx = 3.5f, dy = -7.88f)
                horizontalLineToRelative(dx = 1.37f)
                lineToRelative(dx = 3.5f, dy = 7.88f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 10.82f, y = 12.56f)
                horizontalLineToRelative(dx = 2.36f)
                lineTo(x = 12.0f, y = 9.91f)
                close()
            }
        }.build().also { _autobrightness = it }
    }

@Suppress("ObjectPropertyName")
private var _autobrightness: ImageVector? = null
