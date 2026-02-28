package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FtxToken: ImageVector
    get() {
        val current = _ftxToken
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.FtxToken",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 21.0f, y = 2.0f)
                horizontalLineTo(x = 9.0f)
                curveTo(x1 = 8.4f, y1 = 2.0f, x2 = 8.0f, y2 = 2.4f, x3 = 8.0f, y3 = 3.0f)
                verticalLineToRelative(dy = 3.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.6f, dx2 = 0.4f, dy2 = 1.0f, dx3 = 1.0f, dy3 = 1.0f)
                horizontalLineToRelative(dx = 12.0f)
                curveToRelative(dx1 = 0.6f, dy1 = 0.0f, dx2 = 1.0f, dy2 = -0.4f, dx3 = 1.0f, dy3 = -1.0f)
                verticalLineTo(y = 3.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.6f, dx2 = -0.4f, dy2 = -1.0f, dx3 = -1.0f, dy3 = -1.0f)
                moveToRelative(dx = -9.0f, dy = 15.0f)
                horizontalLineTo(x = 7.0f)
                verticalLineToRelative(dy = 5.0f)
                horizontalLineToRelative(dx = 5.0f)
                close()
                moveTo(x = 7.0f, y = 9.5f)
                horizontalLineTo(x = 2.0f)
                verticalLineToRelative(dy = 5.0f)
                horizontalLineToRelative(dx = 5.0f)
                close()
                moveToRelative(dx = 11.0f, dy = 0.1f)
                horizontalLineTo(x = 9.5f)
                verticalLineToRelative(dy = 4.7f)
                horizontalLineTo(x = 18.0f)
                close()
            }
        }.build().also { _ftxToken = it }
    }

@Suppress("ObjectPropertyName")
private var _ftxToken: ImageVector? = null
