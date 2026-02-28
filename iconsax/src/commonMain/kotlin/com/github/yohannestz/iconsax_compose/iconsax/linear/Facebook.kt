package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Facebook: ImageVector
    get() {
        val current = _facebook
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Facebook",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineCap = StrokeCap.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 14.0f, y = 9.3f)
                verticalLineToRelative(dy = 2.9f)
                horizontalLineToRelative(dx = 2.6f)
                curveToRelative(dx1 = 0.2f, dy1 = 0.0f, dx2 = 0.3f, dy2 = 0.2f, dx3 = 0.3f, dy3 = 0.4f)
                lineToRelative(dx = -0.4f, dy = 1.9f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.1f, dx2 = -0.2f, dy2 = 0.2f, dx3 = -0.3f, dy3 = 0.2f)
                horizontalLineTo(x = 14.0f)
                verticalLineTo(y = 22.0f)
                horizontalLineToRelative(dx = -3.0f)
                verticalLineToRelative(dy = -7.2f)
                horizontalLineTo(x = 9.3f)
                quadTo(x1 = 9.0f, y1 = 14.8f, x2 = 9.0f, y2 = 14.5f)
                verticalLineToRelative(dy = -1.9f)
                quadToRelative(dx1 = 0.0f, dy1 = -0.3f, dx2 = 0.3f, dy2 = -0.3f)
                horizontalLineTo(x = 11.0f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.7f, dx2 = 1.3f, dy2 = -3.0f, dx3 = 3.0f, dy3 = -3.0f)
                horizontalLineToRelative(dx = 2.7f)
                quadTo(x1 = 17.0f, y1 = 6.0f, x2 = 17.0f, y2 = 6.3f)
                verticalLineToRelative(dy = 2.4f)
                quadTo(x1 = 17.0f, y1 = 9.0f, x2 = 16.7f, y2 = 9.0f)
                horizontalLineToRelative(dx = -2.4f)
                quadTo(x1 = 14.0f, y1 = 9.0f, x2 = 14.0f, y2 = 9.3f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 15.0f, y = 22.0f)
                horizontalLineTo(x = 9.0f)
                curveToRelative(dx1 = -5.0f, dy1 = 0.0f, dx2 = -7.0f, dy2 = -2.0f, dx3 = -7.0f, dy3 = -7.0f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -5.0f, dx2 = 2.0f, dy2 = -7.0f, dx3 = 7.0f, dy3 = -7.0f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 5.0f, dy1 = 0.0f, dx2 = 7.0f, dy2 = 2.0f, dx3 = 7.0f, dy3 = 7.0f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 5.0f, dx2 = -2.0f, dy2 = 7.0f, dx3 = -7.0f, dy3 = 7.0f)
            }
        }.build().also { _facebook = it }
    }

@Suppress("ObjectPropertyName")
private var _facebook: ImageVector? = null
