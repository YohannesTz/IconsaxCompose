package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MicrophoneSlashOne: ImageVector
    get() {
        val current = _microphoneSlashOne
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.MicrophoneSlashOne",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 17.62f, y = 5.72f)
                lineTo(x = 7.0f, y = 16.33f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.13f, dy1 = -3.51f)
                verticalLineTo(y = 8.11f)
                arcTo(horizontalEllipseRadius = 6.0f, verticalEllipseRadius = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 8.0f, y1 = 3.5f)
                verticalLineToRelative(dy = 4.14f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.7f, dy1 = 0.71f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.7f, dy1 = -0.71f)
                verticalLineTo(y = 2.57f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.47f, dy1 = -0.48f)
                verticalLineToRelative(dy = 3.66f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.7f, dy1 = 0.71f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.72f, dy1 = -0.71f)
                verticalLineTo(y = 2.0f)
                arcToRelative(a = 6.1f, b = 6.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 5.33f, dy1 = 3.72f)
                moveToRelative(dx = 0.5f, dy = 3.16f)
                verticalLineToRelative(dy = 3.94f)
                arcToRelative(a = 6.13f, b = 6.13f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -6.89f, dy1 = 6.07f)
                lineToRelative(dx = -0.38f, dy = -0.06f)
                lineToRelative(dx = -0.15f, dy = -0.03f)
                lineToRelative(dx = -0.41f, dy = -0.11f)
                lineToRelative(dx = -0.63f, dy = -0.22f)
                lineToRelative(dx = -0.37f, dy = -0.17f)
                lineToRelative(dx = -0.08f, dy = -0.04f)
                quadToRelative(dx1 = -0.15f, dy1 = -0.07f, dx2 = -0.3f, dy2 = -0.17f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 21.75f, y = 11.0f)
                verticalLineToRelative(dy = 2.0f)
                arcToRelative(a = 9.76f, b = 9.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -15.57f, dy1 = 7.82f)
                lineToRelative(dx = 1.08f, dy = -1.08f)
                arcTo(horizontalEllipseRadius = 8.0f, verticalEllipseRadius = 8.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 21.25f)
                curveToRelative(dx1 = 4.55f, dy1 = 0.0f, dx2 = 8.25f, dy2 = -3.7f, dx3 = 8.25f, dy3 = -8.25f)
                verticalLineToRelative(dy = -2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                moveToRelative(dx = 0.02f, dy = -8.77f)
                arcToRelative(a = 0.77f, b = 0.77f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.1f, dy1 = 0.0f)
                lineTo(x = 2.24f, y = 20.69f)
                arcToRelative(a = 0.77f, b = 0.77f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 1.09f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.08f, dy1 = -0.01f)
                lineTo(x = 21.77f, y = 3.3f)
                arcToRelative(a = 0.74f, b = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -1.08f)
            }
        }.build().also { _microphoneSlashOne = it }
    }

@Suppress("ObjectPropertyName")
private var _microphoneSlashOne: ImageVector? = null
