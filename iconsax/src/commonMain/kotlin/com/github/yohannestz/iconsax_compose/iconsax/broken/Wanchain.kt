package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Wanchain: ImageVector
    get() {
        val current = _wanchain
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Wanchain",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 16.77f, y = 4.32f)
                lineToRelative(dx = -0.63f, dy = -1.07f)
                arcTo(horizontalEllipseRadius = 0.5f, verticalEllipseRadius = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 15.71f, y1 = 3.0f)
                horizontalLineTo(x = 8.87f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.43f, dy1 = 0.75f)
                lineTo(x = 11.5f, y = 9.0f)
                horizontalLineTo(x = 5.27f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.42f, dy1 = 0.22f)
                lineToRelative(dx = -3.67f, dy = 5.5f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 0.55f)
                lineToRelative(dx = 3.37f, dy = 5.06f)
                arcTo(horizontalEllipseRadius = 0.5f, verticalEllipseRadius = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 5.4f, y1 = 20.3f)
                lineToRelative(dx = 2.46f, dy = -4.22f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.85f, dy1 = -0.03f)
                lineToRelative(dx = 3.14f, dy = 4.71f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.42f, dy1 = 0.22f)
                horizontalLineToRelative(dx = 6.46f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.42f, dy1 = -0.22f)
                lineToRelative(dx = 3.68f, dy = -5.52f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.02f, dy1 = -0.53f)
                lineToRelative(dx = -3.58f, dy = -6.14f)
                close()
                moveTo(x = 8.5f, y = 15.0f)
                lineToRelative(dx = 3.25f, dy = -5.57f)
                lineToRelative(dx = 2.81f, dy = 4.82f)
                arcTo(horizontalEllipseRadius = 0.5f, verticalEllipseRadius = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 14.13f, y1 = 15.0f)
                close()
            }
        }.build().also { _wanchain = it }
    }

@Suppress("ObjectPropertyName")
private var _wanchain: ImageVector? = null
