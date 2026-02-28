package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FolderConnection: ImageVector
    get() {
        val current = _folderConnection
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.FolderConnection",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.0f, y = 16.0f)
                verticalLineToRelative(dy = 3.0f)
                moveToRelative(dx = -2.0f, dy = 2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.1f, dx2 = 0.9f, dy2 = -2.0f, dx3 = 2.0f, dy3 = -2.0f)
                reflectiveCurveToRelative(dx1 = 2.0f, dy1 = 0.9f, dx2 = 2.0f, dy2 = 2.0f)
                reflectiveCurveToRelative(dx1 = -0.9f, dy1 = 2.0f, dx2 = -2.0f, dy2 = 2.0f)
                moveToRelative(dx = 6.0f, dy = -2.0f)
                horizontalLineToRelative(dx = -4.0f)
                moveToRelative(dx = -4.0f, dy = 0.0f)
                horizontalLineTo(x = 6.0f)
                moveTo(x = 5.0f, y = 5.5f)
                curveTo(x1 = 5.0f, y1 = 2.7f, x2 = 5.7f, y2 = 2.0f, x3 = 8.5f, y3 = 2.0f)
                horizontalLineToRelative(dx = 1.05f)
                curveToRelative(dx1 = 1.05f, dy1 = 0.0f, dx2 = 1.28f, dy2 = 0.31f, dx3 = 1.68f, dy3 = 0.84f)
                lineToRelative(dx = 1.05f, dy = 1.4f)
                curveTo(x1 = 12.55f, y1 = 4.59f, x2 = 12.7f, y2 = 4.8f, x3 = 13.4f, y3 = 4.8f)
                horizontalLineToRelative(dx = 2.1f)
                curveToRelative(dx1 = 2.8f, dy1 = 0.0f, dx2 = 3.5f, dy2 = 0.7f, dx3 = 3.5f, dy3 = 3.5f)
                verticalLineToRelative(dy = 4.2f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.8f, dx2 = -0.7f, dy2 = 3.5f, dx3 = -3.5f, dy3 = 3.5f)
                horizontalLineToRelative(dx = -7.0f)
                curveTo(x1 = 5.7f, y1 = 16.0f, x2 = 5.0f, y2 = 15.3f, x3 = 5.0f, y3 = 12.5f)
                verticalLineTo(y = 9.34f)
            }
        }.build().also { _folderConnection = it }
    }

@Suppress("ObjectPropertyName")
private var _folderConnection: ImageVector? = null
