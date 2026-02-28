package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SimcardTwo: ImageVector
    get() {
        val current = _simcardTwo
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.SimcardTwo",
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
                moveTo(x = 16.0f, y = 12.7f)
                verticalLineToRelative(dy = 5.38f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.34f, dx2 = -1.56f, dy2 = 3.9f, dx3 = -3.89f, dy3 = 3.9f)
                horizontalLineTo(x = 5.89f)
                curveToRelative(dx1 = -2.33f, dy1 = 0.0f, dx2 = -3.89f, dy2 = -1.56f, dx3 = -3.89f, dy3 = -3.9f)
                verticalLineToRelative(dy = -7.77f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.34f, dx2 = 1.56f, dy2 = -3.89f, dx3 = 3.89f, dy3 = -3.89f)
                horizontalLineToRelative(dx = 3.83f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.75f, dy1 = 1.14f)
                lineToRelative(dx = 2.39f, dy = 2.38f)
                arcTo(horizontalEllipseRadius = 4.0f, verticalEllipseRadius = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 16.0f, y1 = 12.7f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 22.0f, y = 8.25f)
                verticalLineToRelative(dy = 5.39f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.33f, dx2 = -1.56f, dy2 = 3.89f, dx3 = -3.89f, dy3 = 3.89f)
                horizontalLineTo(x = 16.0f)
                verticalLineToRelative(dy = -4.84f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.14f, dy1 = -2.75f)
                lineToRelative(dx = -2.39f, dy = -2.38f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.75f, dy1 = -1.14f)
                horizontalLineTo(x = 8.0f)
                verticalLineTo(y = 5.86f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.33f, dx2 = 1.56f, dy2 = -3.9f, dx3 = 3.89f, dy3 = -3.9f)
                horizontalLineToRelative(dx = 3.83f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.75f, dy1 = 1.15f)
                lineToRelative(dx = 2.39f, dy = 2.39f)
                arcTo(horizontalEllipseRadius = 4.0f, verticalEllipseRadius = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 22.0f, y1 = 8.25f)
            }
        }.build().also { _simcardTwo = it }
    }

@Suppress("ObjectPropertyName")
private var _simcardTwo: ImageVector? = null
