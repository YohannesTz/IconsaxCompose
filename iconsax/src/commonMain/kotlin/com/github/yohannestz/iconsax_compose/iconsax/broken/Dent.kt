package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Dent: ImageVector
    get() {
        val current = _dent
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Dent",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.0f, y = 18.15f)
                arcToRelative(a = 1.33f, b = 1.33f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.32f, dy1 = -1.32f)
                verticalLineTo(y = 7.17f)
                arcTo(horizontalEllipseRadius = 1.33f, verticalEllipseRadius = 1.33f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 5.85f)
                arcToRelative(a = 1.33f, b = 1.33f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.32f, dy1 = 1.32f)
                verticalLineToRelative(dy = 9.66f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.73f, dx2 = -0.6f, dy2 = 1.32f, dx3 = -1.32f, dy3 = 1.32f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 6.68f, y = 8.93f)
                arcToRelative(a = 1.3f, b = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.8f, dy1 = -0.48f)
                lineToRelative(dx = 8.37f, dy = 4.83f)
                arcToRelative(a = 1.32f, b = 1.32f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.32f, dy1 = 2.28f)
                lineToRelative(dx = -8.37f, dy = -4.83f)
                arcToRelative(a = 1.3f, b = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.48f, dy1 = -1.8f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 6.68f, y = 15.07f)
                arcToRelative(a = 1.3f, b = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.48f, dy1 = -1.8f)
                lineToRelative(dx = 8.37f, dy = -4.83f)
                arcToRelative(a = 1.3f, b = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.8f, dy1 = 0.48f)
                arcToRelative(a = 1.3f, b = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.48f, dy1 = 1.8f)
                lineToRelative(dx = -8.37f, dy = 4.83f)
                arcToRelative(a = 1.3f, b = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.8f, dy1 = -0.48f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 4.0f, y = 6.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 3.97f, dy1 = -3.15f)
            }
        }.build().also { _dent = it }
    }

@Suppress("ObjectPropertyName")
private var _dent: ImageVector? = null
