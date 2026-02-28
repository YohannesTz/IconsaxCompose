package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RefreshSquare: ImageVector
    get() {
        val current = _refreshSquare
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.RefreshSquare",
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
                moveTo(x = 9.0f, y = 22.0f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 5.0f, dy1 = 0.0f, dx2 = 7.0f, dy2 = -2.0f, dx3 = 7.0f, dy3 = -7.0f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -5.0f, dx2 = -2.0f, dy2 = -7.0f, dx3 = -7.0f, dy3 = -7.0f)
                horizontalLineTo(x = 9.0f)
                curveTo(x1 = 4.0f, y1 = 2.0f, x2 = 2.0f, y2 = 4.0f, x3 = 2.0f, y3 = 9.0f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 5.0f, dx2 = 2.0f, dy2 = 7.0f, dx3 = 7.0f, dy3 = 7.0f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 17.5f, y = 12.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.04f, dx2 = -2.46f, dy2 = 5.5f, dx3 = -5.5f, dy3 = 5.5f)
                reflectiveCurveToRelative(dx1 = -4.89f, dy1 = -3.06f, dx2 = -4.89f, dy2 = -3.06f)
                moveToRelative(dx = 0.0f, dy = 0.0f)
                horizontalLineToRelative(dx = 2.48f)
                moveToRelative(dx = -2.48f, dy = 0.0f)
                verticalLineToRelative(dy = 2.75f)
                moveTo(x = 6.5f, y = 12.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.04f, dx2 = 2.44f, dy2 = -5.5f, dx3 = 5.5f, dy3 = -5.5f)
                curveToRelative(dx1 = 3.67f, dy1 = 0.0f, dx2 = 5.5f, dy2 = 3.06f, dx3 = 5.5f, dy3 = 3.06f)
                moveToRelative(dx = 0.0f, dy = 0.0f)
                verticalLineTo(y = 6.81f)
                moveToRelative(dx = 0.0f, dy = 2.75f)
                horizontalLineToRelative(dx = -2.44f)
            }
        }.build().also { _refreshSquare = it }
    }

@Suppress("ObjectPropertyName")
private var _refreshSquare: ImageVector? = null
