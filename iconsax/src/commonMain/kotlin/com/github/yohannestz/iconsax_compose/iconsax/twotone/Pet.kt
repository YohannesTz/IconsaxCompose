package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Pet: ImageVector
    get() {
        val current = _pet
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Pet",
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
                moveTo(x = 4.41f, y = 16.75f)
                arcTo(horizontalEllipseRadius = 4.78f, verticalEllipseRadius = 4.78f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 9.25f, y1 = 22.0f)
                horizontalLineToRelative(dx = 4.79f)
                curveToRelative(dx1 = 3.26f, dy1 = 0.0f, dx2 = 5.5f, dy2 = -2.63f, dx3 = 4.96f, dy3 = -5.85f)
                arcTo(horizontalEllipseRadius = 7.65f, verticalEllipseRadius = 7.65f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 11.74f, y1 = 10.0f)
                arcToRelative(a = 7.5f, b = 7.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -7.33f, dy1 = 6.75f)
            }
            path(
                fillAlpha = 0.34f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.34f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 10.47f, y = 7.5f)
                arcToRelative(a = 2.5f, b = 2.5f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -5.0f)
                arcToRelative(a = 2.5f, b = 2.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 5.0f)
                moveToRelative(dx = 6.83f, dy = 1.2f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -4.0f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 4.0f)
                moveToRelative(dx = 3.7f, dy = 4.0f)
                arcToRelative(a = 1.5f, b = 1.5f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -3.0f)
                arcToRelative(a = 1.5f, b = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 3.0f)
                moveToRelative(dx = -17.03f, dy = -2.0f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -4.0f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 4.0f)
            }
        }.build().also { _pet = it }
    }

@Suppress("ObjectPropertyName")
private var _pet: ImageVector? = null
